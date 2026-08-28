import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bry implements cpg {
   private static final int a = ayx.d(38.25F);
   private final Map<ji<buq>, bry.a> b = new Object2ObjectOpenHashMap();
   private final brz c;
   private final int d;
   private final Function<bsa, lg> e;
   @Nullable
   private String f;
   private int g;
   private Optional<avy> h = Optional.empty();
   private cpj i = cpl.g;

   protected bry(brz $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> {
         int $$2 = $$1x.f() ? a : 255;
         return lb.a(li.u, ayh.b.b($$2, $$1));
      };
   }

   protected bry(brz $$0, int $$1, lg $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> $$2;
   }

   public int b() {
      return this.g;
   }

   public boolean a(btn $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bss $$0, @Nullable bss $$1, btn $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(btn $$0, int $$1) {
   }

   public void c(btn $$0, int $$1) {
      this.h.ifPresent($$1x -> $$0.dP().a(null, $$0.du(), $$0.dw(), $$0.dA(), $$1x, $$0.de(), 1.0F, 1.0F));
   }

   public void a(btn $$0, int $$1, bss.c $$2) {
   }

   public void a(btn $$0, int $$1, brl $$2, float $$3) {
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

   public xo e() {
      return xo.c(this.d());
   }

   public brz f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public bry a(ji<buq> $$0, String $$1, double $$2, but.a $$3) {
      this.b.put($$0, new bry.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bry a(int $$0) {
      this.g = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<ji<buq>, but> $$1) {
      this.b.forEach(($$2, $$3) -> $$1.accept((ji<buq>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(bus $$0) {
      for (Entry<ji<buq>, bry.a> $$1 : this.b.entrySet()) {
         bur $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bus $$0, int $$1) {
      for (Entry<ji<buq>, bry.a> $$2 : this.b.entrySet()) {
         bur $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.c == brz.a;
   }

   public lg a(bsa $$0) {
      return this.e.apply($$0);
   }

   public bry a(avy $$0) {
      this.h = Optional.of($$0);
      return this;
   }

   public bry a(cph... $$0) {
      this.i = cpl.e.a($$0);
      return this;
   }

   @Override
   public cpj i() {
      return this.i;
   }

   static record a(UUID a, double b, but.a c) {
      public but a(String $$0, int $$1) {
         return new but(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
