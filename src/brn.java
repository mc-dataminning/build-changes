import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class brn implements cow {
   public static final Codec<jj<brn>> a = lq.d.s();
   public static final ys<wf, jj<brn>> b = yq.b(lr.V);
   private static final int c = ayg.d(38.25F);
   private final Map<jj<buf>, brn.a> d = new Object2ObjectOpenHashMap();
   private final bro e;
   private final int f;
   private final Function<brp, lh> g;
   @Nullable
   private String h;
   private int i;
   private Optional<avg> j = Optional.empty();
   private coz k = cpb.f;

   protected brn(bro $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lc.a(lj.u, axq.b.b($$2, $$1));
      };
   }

   protected brn(bro $$0, int $$1, lh $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public boolean a(btc $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bsh $$0, @Nullable bsh $$1, btc $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(btc $$0, int $$1) {
   }

   public void c(btc $$0, int $$1) {
      this.j.ifPresent($$1x -> $$0.dR().a(null, $$0.dw(), $$0.dy(), $$0.dC(), $$1x, $$0.dg(), 1.0F, 1.0F));
   }

   public void a(btc $$0, int $$1, bsh.d $$2) {
   }

   public void a(btc $$0, int $$1, bra $$2, float $$3) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.h == null) {
         this.h = ac.a("effect", lq.d.b(this));
      }

      return this.h;
   }

   public String d() {
      return this.c();
   }

   public wu e() {
      return wu.c(this.d());
   }

   public bro f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public brn a(jj<buf> $$0, String $$1, double $$2, bui.a $$3) {
      this.d.put($$0, new brn.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public brn a(int $$0) {
      this.i = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<jj<buf>, bui> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jj<buf>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(buh $$0) {
      for (Entry<jj<buf>, brn.a> $$1 : this.d.entrySet()) {
         bug $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(buh $$0, int $$1) {
      for (Entry<jj<buf>, brn.a> $$2 : this.d.entrySet()) {
         bug $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.e == bro.a;
   }

   public lh a(brp $$0) {
      return this.g.apply($$0);
   }

   public brn a(avg $$0) {
      this.j = Optional.of($$0);
      return this;
   }

   public brn a(cox... $$0) {
      this.k = cpb.d.a($$0);
      return this;
   }

   @Override
   public coz i() {
      return this.k;
   }

   static record a(UUID a, double b, bui.a c) {
      public bui a(String $$0, int $$1) {
         return new bui(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
