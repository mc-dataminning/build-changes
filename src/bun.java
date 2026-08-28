import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bun implements csq {
   public static final Codec<jq<bun>> a = ma.d.r();
   public static final zt<xg, jq<bun>> b = zr.b(mb.W);
   private static final int c = bae.d(38.25F);
   private final Map<jq<bxj>, bun.a> d = new Object2ObjectOpenHashMap();
   private final buo e;
   private final int f;
   private final Function<bup, lq> g;
   @Nullable
   private String h;
   private int i;
   private Optional<axe> j = Optional.empty();
   private cst k = csv.h;

   protected bun(buo $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return ll.a(ls.u, ayp.c($$2, $$1));
      };
   }

   protected bun(buo $$0, int $$1, lq $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public boolean a(ash $$0, bwg $$1, int $$2) {
      return true;
   }

   public void a(ash $$0, @Nullable bvk $$1, @Nullable bvk $$2, bwg $$3, int $$4, double $$5) {
      this.a($$0, $$3, $$4);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void a(bwg $$0, int $$1) {
   }

   public void b(bwg $$0, int $$1) {
      this.j.ifPresent($$1x -> $$0.dW().a(null, $$0.dB(), $$0.dD(), $$0.dH(), $$1x, $$0.dn(), 1.0F, 1.0F));
   }

   public void a(ash $$0, bwg $$1, int $$2, bvk.d $$3) {
   }

   public void a(ash $$0, bwg $$1, int $$2, bua $$3, float $$4) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.h == null) {
         this.h = ae.a("effect", ma.d.b(this));
      }

      return this.h;
   }

   public String d() {
      return this.c();
   }

   public xv e() {
      return xv.c(this.d());
   }

   public buo f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public bun a(jq<bxj> $$0, alz $$1, double $$2, bxm.a $$3) {
      this.d.put($$0, new bun.a($$1, $$2, $$3));
      return this;
   }

   public bun a(int $$0) {
      this.i = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<jq<bxj>, bxm> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jq<bxj>)$$2, $$3.a($$0)));
   }

   public void a(bxl $$0) {
      for (Entry<jq<bxj>, bun.a> $$1 : this.d.entrySet()) {
         bxk $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(bxl $$0, int $$1) {
      for (Entry<jq<bxj>, bun.a> $$2 : this.d.entrySet()) {
         bxk $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean h() {
      return this.e == buo.a;
   }

   public lq a(bup $$0) {
      return this.g.apply($$0);
   }

   public bun a(axe $$0) {
      this.j = Optional.of($$0);
      return this;
   }

   public bun a(csr... $$0) {
      this.k = csv.f.a($$0);
      return this;
   }

   @Override
   public cst i() {
      return this.k;
   }

   static record a(alz a, double b, bxm.a c) {
      public bxm a(int $$0) {
         return new bxm(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}
