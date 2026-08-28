import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class buc implements csk {
   public static final Codec<jr<buc>> a = mb.d.r();
   public static final yn<wa, jr<buc>> b = yl.b(mc.W);
   private static final int c = ayz.d(38.25F);
   private final Map<jr<bxb>, buc.a> d = new Object2ObjectOpenHashMap();
   private final bud e;
   private final int f;
   private final Function<bue, lr> g;
   @Nullable
   private String h;
   private int i;
   private int j;
   private int k;
   private Optional<avz> l = Optional.empty();
   private csn m = csp.g;

   protected buc(bud $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lm.a(lt.u, axk.c($$2, $$1));
      };
   }

   protected buc(bud $$0, int $$1, lr $$2) {
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

   public boolean a(ard $$0, bvy $$1, int $$2) {
      return true;
   }

   public void a(ard $$0, @Nullable bva $$1, @Nullable bva $$2, bvy $$3, int $$4, double $$5) {
      this.a($$0, $$3, $$4);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void a(bvy $$0, int $$1) {
   }

   public void b(bvy $$0, int $$1) {
      this.l.ifPresent($$1x -> $$0.dU().a(null, $$0.dz(), $$0.dB(), $$0.dF(), $$1x, $$0.dl(), 1.0F, 1.0F));
   }

   public void a(ard $$0, bvy $$1, int $$2, bva.d $$3) {
   }

   public void a(ard $$0, bvy $$1, int $$2, btp $$3, float $$4) {
   }

   public boolean a() {
      return false;
   }

   protected String e() {
      if (this.h == null) {
         this.h = af.a("effect", mb.d.b(this));
      }

      return this.h;
   }

   public String f() {
      return this.e();
   }

   public wp g() {
      return wp.c(this.f());
   }

   public bud h() {
      return this.e;
   }

   public int i() {
      return this.f;
   }

   public buc a(jr<bxb> $$0, aku $$1, double $$2, bxe.a $$3) {
      this.d.put($$0, new buc.a($$1, $$2, $$3));
      return this;
   }

   public buc a(int $$0) {
      return this.a($$0, $$0, $$0);
   }

   public buc a(int $$0, int $$1, int $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      return this;
   }

   public void a(int $$0, BiConsumer<jr<bxb>, bxe> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jr<bxb>)$$2, $$3.a($$0)));
   }

   public void a(bxd $$0) {
      for (Entry<jr<bxb>, buc.a> $$1 : this.d.entrySet()) {
         bxc $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(bxd $$0, int $$1) {
      for (Entry<jr<bxb>, buc.a> $$2 : this.d.entrySet()) {
         bxc $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean j() {
      return this.e == bud.a;
   }

   public lr a(bue $$0) {
      return this.g.apply($$0);
   }

   public buc a(avz $$0) {
      this.l = Optional.of($$0);
      return this;
   }

   public buc a(csl... $$0) {
      this.m = csp.e.a($$0);
      return this;
   }

   @Override
   public csn k() {
      return this.m;
   }

   static record a(aku a, double b, bxe.a c) {
      public bxe a(int $$0) {
         return new bxe(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}
