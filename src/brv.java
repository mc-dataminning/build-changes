import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class brv implements cpd {
   private static final int a = ayu.d(38.25F);
   private final Map<ji<bun>, brv.a> b = new Object2ObjectOpenHashMap();
   private final brw c;
   private final int d;
   private final Function<brx, lh> e;
   @Nullable
   private String f;
   private int g;
   private Optional<avv> h = Optional.empty();
   private cpg i = cpi.g;

   protected brv(brw $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> {
         int $$2 = $$1x.f() ? a : 255;
         return lb.a(lj.u, aye.b.b($$2, $$1));
      };
   }

   protected brv(brw $$0, int $$1, lh $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> $$2;
   }

   public int b() {
      return this.g;
   }

   public boolean a(btk $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bsp $$0, @Nullable bsp $$1, btk $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(btk $$0, int $$1) {
   }

   public void c(btk $$0, int $$1) {
      this.h.ifPresent($$1x -> $$0.dP().a(null, $$0.du(), $$0.dw(), $$0.dA(), $$1x, $$0.de(), 1.0F, 1.0F));
   }

   public void a(btk $$0, int $$1, bsp.c $$2) {
   }

   public void a(btk $$0, int $$1, bri $$2, float $$3) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.f == null) {
         this.f = ac.a("effect", lp.d.b(this));
      }

      return this.f;
   }

   public String d() {
      return this.c();
   }

   public xl e() {
      return xl.c(this.d());
   }

   public brw f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public brv a(ji<bun> $$0, String $$1, double $$2, buq.a $$3) {
      this.b.put($$0, new brv.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public brv a(int $$0) {
      this.g = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<ji<bun>, buq> $$1) {
      this.b.forEach(($$2, $$3) -> $$1.accept((ji<bun>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(bup $$0) {
      for (Entry<ji<bun>, brv.a> $$1 : this.b.entrySet()) {
         buo $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bup $$0, int $$1) {
      for (Entry<ji<bun>, brv.a> $$2 : this.b.entrySet()) {
         buo $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.c == brw.a;
   }

   public lh a(brx $$0) {
      return this.e.apply($$0);
   }

   public brv a(avv $$0) {
      this.h = Optional.of($$0);
      return this;
   }

   public brv a(cpe... $$0) {
      this.i = cpi.e.a($$0);
      return this;
   }

   @Override
   public cpg i() {
      return this.i;
   }

   static record a(UUID a, double b, buq.a c) {
      public buq a(String $$0, int $$1) {
         return new buq(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
