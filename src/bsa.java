import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bsa implements cpi {
   private static final int a = ayz.d(38.25F);
   private final Map<ji<bus>, bsa.a> b = new Object2ObjectOpenHashMap();
   private final bsb c;
   private final int d;
   private final Function<bsc, lg> e;
   @Nullable
   private String f;
   private int g;
   private Optional<avz> h = Optional.empty();
   private cpl i = cpn.g;

   protected bsa(bsb $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> {
         int $$2 = $$1x.f() ? a : 255;
         return lb.a(li.u, ayj.b.b($$2, $$1));
      };
   }

   protected bsa(bsb $$0, int $$1, lg $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> $$2;
   }

   public int b() {
      return this.g;
   }

   public boolean a(btp $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bsu $$0, @Nullable bsu $$1, btp $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(btp $$0, int $$1) {
   }

   public void c(btp $$0, int $$1) {
      this.h.ifPresent($$1x -> $$0.dP().a(null, $$0.du(), $$0.dw(), $$0.dA(), $$1x, $$0.de(), 1.0F, 1.0F));
   }

   public void a(btp $$0, int $$1, bsu.c $$2) {
   }

   public void a(btp $$0, int $$1, brn $$2, float $$3) {
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

   public xp e() {
      return xp.c(this.d());
   }

   public bsb f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public bsa a(ji<bus> $$0, String $$1, double $$2, buv.a $$3) {
      this.b.put($$0, new bsa.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bsa a(int $$0) {
      this.g = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<ji<bus>, buv> $$1) {
      this.b.forEach(($$2, $$3) -> $$1.accept((ji<bus>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(buu $$0) {
      for (Entry<ji<bus>, bsa.a> $$1 : this.b.entrySet()) {
         but $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(buu $$0, int $$1) {
      for (Entry<ji<bus>, bsa.a> $$2 : this.b.entrySet()) {
         but $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.c == bsb.a;
   }

   public lg a(bsc $$0) {
      return this.e.apply($$0);
   }

   public bsa a(avz $$0) {
      this.h = Optional.of($$0);
      return this;
   }

   public bsa a(cpj... $$0) {
      this.i = cpn.e.a($$0);
      return this;
   }

   @Override
   public cpl i() {
      return this.i;
   }

   static record a(UUID a, double b, buv.a c) {
      public buv a(String $$0, int $$1) {
         return new buv(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
