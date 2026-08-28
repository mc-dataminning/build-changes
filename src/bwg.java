import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bwg implements cvp {
   public static final Codec<jg<bwg>> a = mh.d.r();
   public static final ze<wp, jg<bwg>> b = zc.b(mi.W);
   private static final int c = azz.d(38.25F);
   private final Map<jg<bzg>, bwg.a> d = new Object2ObjectOpenHashMap();
   private final bwh e;
   private final int f;
   private final Function<bwi, lx> g;
   @Nullable
   private String h;
   private int i;
   private int j;
   private int k;
   private Optional<awx> l = Optional.empty();
   private cvs m = cvu.g;

   protected bwg(bwh $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return ls.a(lz.u, ayh.c($$2, $$1));
      };
   }

   protected bwg(bwh $$0, int $$1, lx $$2) {
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

   public boolean a(asb $$0, byf $$1, int $$2) {
      return true;
   }

   public void a(asb $$0, @Nullable bxe $$1, @Nullable bxe $$2, byf $$3, int $$4, double $$5) {
      this.a($$0, $$3, $$4);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void a(byf $$0, int $$1) {
   }

   public void b(byf $$0, int $$1) {
      this.l.ifPresent($$1x -> $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), $$1x, $$0.dm(), 1.0F, 1.0F));
   }

   public void a(asb $$0, byf $$1, int $$2, bxe.d $$3) {
   }

   public void a(asb $$0, byf $$1, int $$2, bvt $$3, float $$4) {
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

   public xg g() {
      return xg.c(this.f());
   }

   public bwh h() {
      return this.e;
   }

   public int i() {
      return this.f;
   }

   public bwg a(jg<bzg> $$0, alr $$1, double $$2, bzj.a $$3) {
      this.d.put($$0, new bwg.a($$1, $$2, $$3));
      return this;
   }

   public bwg a(int $$0) {
      return this.a($$0, $$0, $$0);
   }

   public bwg a(int $$0, int $$1, int $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      return this;
   }

   public void a(int $$0, BiConsumer<jg<bzg>, bzj> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jg<bzg>)$$2, $$3.a($$0)));
   }

   public void a(bzi $$0) {
      for (Entry<jg<bzg>, bwg.a> $$1 : this.d.entrySet()) {
         bzh $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(bzi $$0, int $$1) {
      for (Entry<jg<bzg>, bwg.a> $$2 : this.d.entrySet()) {
         bzh $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean j() {
      return this.e == bwh.a;
   }

   public lx a(bwi $$0) {
      return this.g.apply($$0);
   }

   public bwg a(awx $$0) {
      this.l = Optional.of($$0);
      return this;
   }

   public bwg a(cvq... $$0) {
      this.m = cvu.e.a($$0);
      return this;
   }

   @Override
   public cvs k() {
      return this.m;
   }

   static record a(alr a, double b, bzj.a c) {
      public bzj a(int $$0) {
         return new bzj(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}
