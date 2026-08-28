import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bvx implements cvg {
   public static final Codec<jg<bvx>> a = mh.d.r();
   public static final za<wn, jg<bvx>> b = yy.b(mi.W);
   private static final int c = azq.d(38.25F);
   private final Map<jg<byx>, bvx.a> d = new Object2ObjectOpenHashMap();
   private final bvy e;
   private final int f;
   private final Function<bvz, lx> g;
   @Nullable
   private String h;
   private int i;
   private int j;
   private int k;
   private Optional<awq> l = Optional.empty();
   private cvj m = cvl.g;

   protected bvx(bvy $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return ls.a(lz.u, aya.c($$2, $$1));
      };
   }

   protected bvx(bvy $$0, int $$1, lx $$2) {
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

   public boolean a(aru $$0, bxw $$1, int $$2) {
      return true;
   }

   public void a(aru $$0, @Nullable bwv $$1, @Nullable bwv $$2, bxw $$3, int $$4, double $$5) {
      this.a($$0, $$3, $$4);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void a(bxw $$0, int $$1) {
   }

   public void b(bxw $$0, int $$1) {
      this.l.ifPresent($$1x -> $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), $$1x, $$0.dm(), 1.0F, 1.0F));
   }

   public void a(aru $$0, bxw $$1, int $$2, bwv.d $$3) {
   }

   public void a(aru $$0, bxw $$1, int $$2, bvk $$3, float $$4) {
   }

   public boolean a() {
      return false;
   }

   protected String e() {
      if (this.h == null) {
         this.h = ag.a("effect", mh.d.b(this));
      }

      return this.h;
   }

   public String f() {
      return this.e();
   }

   public xc g() {
      return xc.c(this.f());
   }

   public bvy h() {
      return this.e;
   }

   public int i() {
      return this.f;
   }

   public bvx a(jg<byx> $$0, alk $$1, double $$2, bza.a $$3) {
      this.d.put($$0, new bvx.a($$1, $$2, $$3));
      return this;
   }

   public bvx a(int $$0) {
      return this.a($$0, $$0, $$0);
   }

   public bvx a(int $$0, int $$1, int $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      return this;
   }

   public void a(int $$0, BiConsumer<jg<byx>, bza> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jg<byx>)$$2, $$3.a($$0)));
   }

   public void a(byz $$0) {
      for (Entry<jg<byx>, bvx.a> $$1 : this.d.entrySet()) {
         byy $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(byz $$0, int $$1) {
      for (Entry<jg<byx>, bvx.a> $$2 : this.d.entrySet()) {
         byy $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean j() {
      return this.e == bvy.a;
   }

   public lx a(bvz $$0) {
      return this.g.apply($$0);
   }

   public bvx a(awq $$0) {
      this.l = Optional.of($$0);
      return this;
   }

   public bvx a(cvh... $$0) {
      this.m = cvl.e.a($$0);
      return this;
   }

   @Override
   public cvj k() {
      return this.m;
   }

   static record a(alk a, double b, bza.a c) {
      public bza a(int $$0) {
         return new bza(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}
