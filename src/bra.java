import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bra implements cog {
   private static final int a = ayd.d(38.25F);
   private final Map<ix<btr>, bra.a> b = new Object2ObjectOpenHashMap();
   private final brb c;
   private final int d;
   private final Function<brc, kw> e;
   @Nullable
   private String f;
   private int g;
   private Optional<avg> h = Optional.empty();
   private coj i = col.g;

   protected bra(brb $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> {
         int $$2 = $$1x.f() ? a : 255;
         return kq.a(ky.u, axo.b.b($$2, $$1));
      };
   }

   protected bra(brb $$0, int $$1, kw $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> $$2;
   }

   public int b() {
      return this.g;
   }

   public boolean a(bso $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bru $$0, @Nullable bru $$1, bso $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bso $$0, int $$1) {
   }

   public void c(bso $$0, int $$1) {
      this.h.ifPresent($$1x -> $$0.dP().a(null, $$0.du(), $$0.dw(), $$0.dA(), $$1x, $$0.de(), 1.0F, 1.0F));
   }

   public void a(bso $$0, int $$1, bru.c $$2) {
   }

   public void a(bso $$0, int $$1, bqn $$2, float $$3) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.f == null) {
         this.f = ac.a("effect", le.d.b(this));
      }

      return this.f;
   }

   public String d() {
      return this.c();
   }

   public wx e() {
      return wx.c(this.d());
   }

   public brb f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public bra a(ix<btr> $$0, String $$1, double $$2, btu.a $$3) {
      this.b.put($$0, new bra.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bra a(int $$0) {
      this.g = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<ix<btr>, btu> $$1) {
      this.b.forEach(($$2, $$3) -> $$1.accept((ix<btr>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(btt $$0) {
      for (Entry<ix<btr>, bra.a> $$1 : this.b.entrySet()) {
         bts $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(btt $$0, int $$1) {
      for (Entry<ix<btr>, bra.a> $$2 : this.b.entrySet()) {
         bts $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.c == brb.a;
   }

   public kw a(brc $$0) {
      return this.e.apply($$0);
   }

   public bra a(avg $$0) {
      this.h = Optional.of($$0);
      return this;
   }

   public bra a(coh... $$0) {
      this.i = col.e.a($$0);
      return this;
   }

   @Override
   public coj i() {
      return this.i;
   }

   static record a(UUID a, double b, btu.a c) {
      public btu a(String $$0, int $$1) {
         return new btu(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
