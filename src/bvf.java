import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bvf implements cue {
   public static final Codec<je<bvf>> a = mf.d.r();
   public static final yw<wj, je<bvf>> b = yu.b(mg.W);
   private static final int c = azm.d(38.25F);
   private final Map<je<byd>, bvf.a> d = new Object2ObjectOpenHashMap();
   private final bvg e;
   private final int f;
   private final Function<bvh, lv> g;
   @Nullable
   private String h;
   private int i;
   private int j;
   private int k;
   private Optional<awm> l = Optional.empty();
   private cuh m = cuj.g;

   protected bvf(bvg $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lq.a(lx.u, axw.c($$2, $$1));
      };
   }

   protected bvf(bvg $$0, int $$1, lv $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public int c() {
      return this.j;
   }

   public int d() {
      return this.k;
   }

   public boolean a(arq $$0, bxc $$1, int $$2) {
      return true;
   }

   public void a(arq $$0, @Nullable bwd $$1, @Nullable bwd $$2, bxc $$3, int $$4, double $$5) {
      this.a($$0, $$3, $$4);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void a(bxc $$0, int $$1) {
   }

   public void b(bxc $$0, int $$1) {
      this.l.ifPresent($$1x -> $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), $$1x, $$0.dm(), 1.0F, 1.0F));
   }

   public void a(arq $$0, bxc $$1, int $$2, bwd.e $$3) {
   }

   public void a(arq $$0, bxc $$1, int $$2, bus $$3, float $$4) {
   }

   public boolean a() {
      return false;
   }

   protected String e() {
      if (this.h == null) {
         this.h = af.a("effect", mf.d.b(this));
      }

      return this.h;
   }

   public String f() {
      return this.e();
   }

   public wy g() {
      return wy.c(this.f());
   }

   public bvg h() {
      return this.e;
   }

   public int i() {
      return this.f;
   }

   public bvf a(je<byd> $$0, alg $$1, double $$2, byg.a $$3) {
      this.d.put($$0, new bvf.a($$1, $$2, $$3));
      return this;
   }

   public bvf a(int $$0) {
      return this.a($$0, $$0, $$0);
   }

   public bvf a(int $$0, int $$1, int $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      return this;
   }

   public void a(int $$0, BiConsumer<je<byd>, byg> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((je<byd>)$$2, $$3.a($$0)));
   }

   public void a(byf $$0) {
      for (Entry<je<byd>, bvf.a> $$1 : this.d.entrySet()) {
         bye $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(byf $$0, int $$1) {
      for (Entry<je<byd>, bvf.a> $$2 : this.d.entrySet()) {
         bye $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean j() {
      return this.e == bvg.a;
   }

   public lv a(bvh $$0) {
      return this.g.apply($$0);
   }

   public bvf a(awm $$0) {
      this.l = Optional.of($$0);
      return this;
   }

   public bvf a(cuf... $$0) {
      this.m = cuj.e.a($$0);
      return this;
   }

   @Override
   public cuh k() {
      return this.m;
   }

   static record a(alg a, double b, byg.a c) {
      public byg a(int $$0) {
         return new byg(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}
