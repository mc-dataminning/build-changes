import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class brz implements cph {
   private static final int a = ayy.d(38.25F);
   private final Map<ji<bur>, brz.a> b = new Object2ObjectOpenHashMap();
   private final bsa c;
   private final int d;
   private final Function<bsb, lg> e;
   @Nullable
   private String f;
   private int g;
   private Optional<avy> h = Optional.empty();
   private cpk i = cpm.g;

   protected brz(bsa $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> {
         int $$2 = $$1x.f() ? a : 255;
         return lb.a(li.u, ayi.b.b($$2, $$1));
      };
   }

   protected brz(bsa $$0, int $$1, lg $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> $$2;
   }

   public int b() {
      return this.g;
   }

   public boolean a(bto $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bst $$0, @Nullable bst $$1, bto $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bto $$0, int $$1) {
   }

   public void c(bto $$0, int $$1) {
      this.h.ifPresent($$1x -> $$0.dP().a(null, $$0.du(), $$0.dw(), $$0.dA(), $$1x, $$0.de(), 1.0F, 1.0F));
   }

   public void a(bto $$0, int $$1, bst.c $$2) {
   }

   public void a(bto $$0, int $$1, brm $$2, float $$3) {
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

   public bsa f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public brz a(ji<bur> $$0, String $$1, double $$2, buu.a $$3) {
      this.b.put($$0, new brz.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public brz a(int $$0) {
      this.g = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<ji<bur>, buu> $$1) {
      this.b.forEach(($$2, $$3) -> $$1.accept((ji<bur>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(but $$0) {
      for (Entry<ji<bur>, brz.a> $$1 : this.b.entrySet()) {
         bus $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(but $$0, int $$1) {
      for (Entry<ji<bur>, brz.a> $$2 : this.b.entrySet()) {
         bus $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.c == bsa.a;
   }

   public lg a(bsb $$0) {
      return this.e.apply($$0);
   }

   public brz a(avy $$0) {
      this.h = Optional.of($$0);
      return this;
   }

   public brz a(cpi... $$0) {
      this.i = cpm.e.a($$0);
      return this;
   }

   @Override
   public cpk i() {
      return this.i;
   }

   static record a(UUID a, double b, buu.a c) {
      public buu a(String $$0, int $$1) {
         return new buu(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
