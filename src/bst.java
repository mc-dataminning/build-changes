import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bst implements cqk {
   public static final Codec<jn<bst>> a = lu.d.r();
   public static final zb<wo, jn<bst>> b = yz.b(lv.W);
   private static final int c = azd.d(38.25F);
   private final Map<jn<bvm>, bst.a> d = new Object2ObjectOpenHashMap();
   private final bsu e;
   private final int f;
   private final Function<bsv, ll> g;
   @Nullable
   private String h;
   private int i;
   private Optional<awd> j = Optional.empty();
   private cqn k = cqp.h;

   protected bst(bsu $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lg.a(ln.u, axo.c($$2, $$1));
      };
   }

   protected bst(bsu $$0, int $$1, ll $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public boolean a(buk $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bto $$0, @Nullable bto $$1, buk $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(buk $$0, int $$1) {
   }

   public void c(buk $$0, int $$1) {
      this.j.ifPresent($$1x -> $$0.dS().a(null, $$0.dx(), $$0.dz(), $$0.dD(), $$1x, $$0.di(), 1.0F, 1.0F));
   }

   public void a(buk $$0, int $$1, bto.c $$2) {
   }

   public void a(buk $$0, int $$1, bsg $$2, float $$3) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.h == null) {
         this.h = ad.a("effect", lu.d.b(this));
      }

      return this.h;
   }

   public String d() {
      return this.c();
   }

   public xd e() {
      return xd.c(this.d());
   }

   public bsu f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public bst a(jn<bvm> $$0, alc $$1, double $$2, bvp.a $$3) {
      this.d.put($$0, new bst.a($$1, $$2, $$3));
      return this;
   }

   public bst a(int $$0) {
      this.i = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<jn<bvm>, bvp> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jn<bvm>)$$2, $$3.a($$0)));
   }

   public void a(bvo $$0) {
      for (Entry<jn<bvm>, bst.a> $$1 : this.d.entrySet()) {
         bvn $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(bvo $$0, int $$1) {
      for (Entry<jn<bvm>, bst.a> $$2 : this.d.entrySet()) {
         bvn $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean h() {
      return this.e == bsu.a;
   }

   public ll a(bsv $$0) {
      return this.g.apply($$0);
   }

   public bst a(awd $$0) {
      this.j = Optional.of($$0);
      return this;
   }

   public bst a(cql... $$0) {
      this.k = cqp.f.a($$0);
      return this;
   }

   @Override
   public cqn i() {
      return this.k;
   }

   static record a(alc a, double b, bvp.a c) {
      public bvp a(int $$0) {
         return new bvp(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}
