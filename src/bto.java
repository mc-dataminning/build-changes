import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bto implements crq {
   public static final Codec<jr<bto>> a = mb.d.r();
   public static final yn<wa, jr<bto>> b = yl.b(mc.W);
   private static final int c = ayz.d(38.25F);
   private final Map<jr<bwk>, bto.a> d = new Object2ObjectOpenHashMap();
   private final btp e;
   private final int f;
   private final Function<btq, lr> g;
   @Nullable
   private String h;
   private int i;
   private Optional<avz> j = Optional.empty();
   private crt k = crv.g;

   protected bto(btp $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lm.a(lt.u, axk.c($$2, $$1));
      };
   }

   protected bto(btp $$0, int $$1, lr $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public boolean a(ard $$0, bvh $$1, int $$2) {
      return true;
   }

   public void a(ard $$0, @Nullable bul $$1, @Nullable bul $$2, bvh $$3, int $$4, double $$5) {
      this.a($$0, $$3, $$4);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void a(bvh $$0, int $$1) {
   }

   public void b(bvh $$0, int $$1) {
      this.j.ifPresent($$1x -> $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), $$1x, $$0.dm(), 1.0F, 1.0F));
   }

   public void a(ard $$0, bvh $$1, int $$2, bul.d $$3) {
   }

   public void a(ard $$0, bvh $$1, int $$2, btb $$3, float $$4) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.h == null) {
         this.h = af.a("effect", mb.d.b(this));
      }

      return this.h;
   }

   public String d() {
      return this.c();
   }

   public wp e() {
      return wp.c(this.d());
   }

   public btp f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public bto a(jr<bwk> $$0, akv $$1, double $$2, bwn.a $$3) {
      this.d.put($$0, new bto.a($$1, $$2, $$3));
      return this;
   }

   public bto a(int $$0) {
      this.i = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<jr<bwk>, bwn> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jr<bwk>)$$2, $$3.a($$0)));
   }

   public void a(bwm $$0) {
      for (Entry<jr<bwk>, bto.a> $$1 : this.d.entrySet()) {
         bwl $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(bwm $$0, int $$1) {
      for (Entry<jr<bwk>, bto.a> $$2 : this.d.entrySet()) {
         bwl $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean h() {
      return this.e == btp.a;
   }

   public lr a(btq $$0) {
      return this.g.apply($$0);
   }

   public bto a(avz $$0) {
      this.j = Optional.of($$0);
      return this;
   }

   public bto a(crr... $$0) {
      this.k = crv.e.a($$0);
      return this;
   }

   @Override
   public crt i() {
      return this.k;
   }

   static record a(akv a, double b, bwn.a c) {
      public bwn a(int $$0) {
         return new bwn(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}
