import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bui implements csl {
   public static final Codec<jq<bui>> a = ma.d.r();
   public static final zt<xg, jq<bui>> b = zr.b(mb.W);
   private static final int c = bae.d(38.25F);
   private final Map<jq<bxe>, bui.a> d = new Object2ObjectOpenHashMap();
   private final buj e;
   private final int f;
   private final Function<buk, lq> g;
   @Nullable
   private String h;
   private int i;
   private Optional<axe> j = Optional.empty();
   private cso k = csq.h;

   protected bui(buj $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return ll.a(ls.u, ayp.c($$2, $$1));
      };
   }

   protected bui(buj $$0, int $$1, lq $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public boolean a(ash $$0, bwb $$1, int $$2) {
      return true;
   }

   public void a(ash $$0, @Nullable bvf $$1, @Nullable bvf $$2, bwb $$3, int $$4, double $$5) {
      this.a($$0, $$3, $$4);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void a(bwb $$0, int $$1) {
   }

   public void b(bwb $$0, int $$1) {
      this.j.ifPresent($$1x -> $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), $$1x, $$0.dm(), 1.0F, 1.0F));
   }

   public void a(ash $$0, bwb $$1, int $$2, bvf.c $$3) {
   }

   public void a(ash $$0, bwb $$1, int $$2, btv $$3, float $$4) {
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

   public buj f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public bui a(jq<bxe> $$0, alz $$1, double $$2, bxh.a $$3) {
      this.d.put($$0, new bui.a($$1, $$2, $$3));
      return this;
   }

   public bui a(int $$0) {
      this.i = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<jq<bxe>, bxh> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jq<bxe>)$$2, $$3.a($$0)));
   }

   public void a(bxg $$0) {
      for (Entry<jq<bxe>, bui.a> $$1 : this.d.entrySet()) {
         bxf $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(bxg $$0, int $$1) {
      for (Entry<jq<bxe>, bui.a> $$2 : this.d.entrySet()) {
         bxf $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean h() {
      return this.e == buj.a;
   }

   public lq a(buk $$0) {
      return this.g.apply($$0);
   }

   public bui a(axe $$0) {
      this.j = Optional.of($$0);
      return this;
   }

   public bui a(csm... $$0) {
      this.k = csq.f.a($$0);
      return this;
   }

   @Override
   public cso i() {
      return this.k;
   }

   static record a(alz a, double b, bxh.a c) {
      public bxh a(int $$0) {
         return new bxh(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}
