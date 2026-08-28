import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bue implements csh {
   public static final Codec<jq<bue>> a = ma.d.r();
   public static final zi<wv, jq<bue>> b = zg.b(mb.W);
   private static final int c = azu.d(38.25F);
   private final Map<jq<bxa>, bue.a> d = new Object2ObjectOpenHashMap();
   private final buf e;
   private final int f;
   private final Function<bug, lq> g;
   @Nullable
   private String h;
   private int i;
   private Optional<awu> j = Optional.empty();
   private csk k = csm.g;

   protected bue(buf $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return ll.a(ls.u, ayf.c($$2, $$1));
      };
   }

   protected bue(buf $$0, int $$1, lq $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public boolean a(arx $$0, bvx $$1, int $$2) {
      return true;
   }

   public void a(arx $$0, @Nullable bvb $$1, @Nullable bvb $$2, bvx $$3, int $$4, double $$5) {
      this.a($$0, $$3, $$4);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void a(bvx $$0, int $$1) {
   }

   public void b(bvx $$0, int $$1) {
      this.j.ifPresent($$1x -> $$0.dW().a(null, $$0.dB(), $$0.dD(), $$0.dH(), $$1x, $$0.dn(), 1.0F, 1.0F));
   }

   public void a(arx $$0, bvx $$1, int $$2, bvb.d $$3) {
   }

   public void a(arx $$0, bvx $$1, int $$2, btr $$3, float $$4) {
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

   public xk e() {
      return xk.c(this.d());
   }

   public buf f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public bue a(jq<bxa> $$0, alp $$1, double $$2, bxd.a $$3) {
      this.d.put($$0, new bue.a($$1, $$2, $$3));
      return this;
   }

   public bue a(int $$0) {
      this.i = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<jq<bxa>, bxd> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jq<bxa>)$$2, $$3.a($$0)));
   }

   public void a(bxc $$0) {
      for (Entry<jq<bxa>, bue.a> $$1 : this.d.entrySet()) {
         bxb $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(bxc $$0, int $$1) {
      for (Entry<jq<bxa>, bue.a> $$2 : this.d.entrySet()) {
         bxb $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean h() {
      return this.e == buf.a;
   }

   public lq a(bug $$0) {
      return this.g.apply($$0);
   }

   public bue a(awu $$0) {
      this.j = Optional.of($$0);
      return this;
   }

   public bue a(csi... $$0) {
      this.k = csm.e.a($$0);
      return this;
   }

   @Override
   public csk i() {
      return this.k;
   }

   static record a(alp a, double b, bxd.a c) {
      public bxd a(int $$0) {
         return new bxd(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}
