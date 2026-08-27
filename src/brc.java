import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class brc implements coi {
   private static final int a = ayf.d(38.25F);
   private final Map<ix<btt>, brc.a> b = new Object2ObjectOpenHashMap();
   private final brd c;
   private final int d;
   private final Function<bre, kw> e;
   @Nullable
   private String f;
   private int g;
   private Optional<avh> h = Optional.empty();
   private col i = coo.g;

   protected brc(brd $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> {
         int $$2 = $$1x.f() ? a : 255;
         return kq.a(ky.u, axp.b.b($$2, $$1));
      };
   }

   protected brc(brd $$0, int $$1, kw $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> $$2;
   }

   public int b() {
      return this.g;
   }

   public boolean a(bsq $$0, int $$1) {
      return true;
   }

   public void a(@Nullable brw $$0, @Nullable brw $$1, bsq $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bsq $$0, int $$1) {
   }

   public void c(bsq $$0, int $$1) {
      this.h.ifPresent($$1x -> $$0.dP().a(null, $$0.du(), $$0.dw(), $$0.dA(), $$1x, $$0.de(), 1.0F, 1.0F));
   }

   public void a(bsq $$0, int $$1, brw.c $$2) {
   }

   public void a(bsq $$0, int $$1, bqp $$2, float $$3) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.f == null) {
         this.f = ac.a("effect", le.d.b(this));
      }

      return this.f;
   }

   public String d() {
      return this.c();
   }

   public wx e() {
      return wx.c(this.d());
   }

   public brd f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public brc a(ix<btt> $$0, String $$1, double $$2, btw.a $$3) {
      this.b.put($$0, new brc.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public brc a(int $$0) {
      this.g = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<ix<btt>, btw> $$1) {
      this.b.forEach(($$2, $$3) -> $$1.accept((ix<btt>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(btv $$0) {
      for (Entry<ix<btt>, brc.a> $$1 : this.b.entrySet()) {
         btu $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(btv $$0, int $$1) {
      for (Entry<ix<btt>, brc.a> $$2 : this.b.entrySet()) {
         btu $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.c == brd.a;
   }

   public kw a(bre $$0) {
      return this.e.apply($$0);
   }

   public brc a(avh $$0) {
      this.h = Optional.of($$0);
      return this;
   }

   public brc a(coj... $$0) {
      this.i = coo.e.a($$0);
      return this;
   }

   @Override
   public col i() {
      return this.i;
   }

   static record a(UUID a, double b, btw.a c) {
      public btw a(String $$0, int $$1) {
         return new btw(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
