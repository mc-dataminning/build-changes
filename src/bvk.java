import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bvk implements cuq {
   public static final Codec<jf<bvk>> a = mg.d.r();
   public static final yw<wj, jf<bvk>> b = yu.b(mh.W);
   private static final int c = azm.d(38.25F);
   private final Map<jf<byk>, bvk.a> d = new Object2ObjectOpenHashMap();
   private final bvl e;
   private final int f;
   private final Function<bvm, lw> g;
   @Nullable
   private String h;
   private int i;
   private int j;
   private int k;
   private Optional<awm> l = Optional.empty();
   private cut m = cuv.g;

   protected bvk(bvl $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lr.a(ly.u, axw.c($$2, $$1));
      };
   }

   protected bvk(bvl $$0, int $$1, lw $$2) {
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

   public boolean a(arq $$0, bxj $$1, int $$2) {
      return true;
   }

   public void a(arq $$0, @Nullable bwi $$1, @Nullable bwi $$2, bxj $$3, int $$4, double $$5) {
      this.a($$0, $$3, $$4);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void a(bxj $$0, int $$1) {
   }

   public void b(bxj $$0, int $$1) {
      this.l.ifPresent($$1x -> $$0.dU().a(null, $$0.dz(), $$0.dB(), $$0.dF(), $$1x, $$0.dl(), 1.0F, 1.0F));
   }

   public void a(arq $$0, bxj $$1, int $$2, bwi.d $$3) {
   }

   public void a(arq $$0, bxj $$1, int $$2, bux $$3, float $$4) {
   }

   public boolean a() {
      return false;
   }

   protected String e() {
      if (this.h == null) {
         this.h = ag.a("effect", mg.d.b(this));
      }

      return this.h;
   }

   public String f() {
      return this.e();
   }

   public wy g() {
      return wy.c(this.f());
   }

   public bvl h() {
      return this.e;
   }

   public int i() {
      return this.f;
   }

   public bvk a(jf<byk> $$0, alg $$1, double $$2, byn.a $$3) {
      this.d.put($$0, new bvk.a($$1, $$2, $$3));
      return this;
   }

   public bvk a(int $$0) {
      return this.a($$0, $$0, $$0);
   }

   public bvk a(int $$0, int $$1, int $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      return this;
   }

   public void a(int $$0, BiConsumer<jf<byk>, byn> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jf<byk>)$$2, $$3.a($$0)));
   }

   public void a(bym $$0) {
      for (Entry<jf<byk>, bvk.a> $$1 : this.d.entrySet()) {
         byl $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(bym $$0, int $$1) {
      for (Entry<jf<byk>, bvk.a> $$2 : this.d.entrySet()) {
         byl $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean j() {
      return this.e == bvl.a;
   }

   public lw a(bvm $$0) {
      return this.g.apply($$0);
   }

   public bvk a(awm $$0) {
      this.l = Optional.of($$0);
      return this;
   }

   public bvk a(cur... $$0) {
      this.m = cuv.e.a($$0);
      return this;
   }

   @Override
   public cut k() {
      return this.m;
   }

   static record a(alg a, double b, byn.a c) {
      public byn a(int $$0) {
         return new byn(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}
