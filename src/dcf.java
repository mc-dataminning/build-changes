import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record dcf(float d, dac e, jg<awq> f, boolean g, List<ddo> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<dcf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayy.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(dcf::c),
               dac.l.optionalFieldOf("animation", dac.b).forGetter(dcf::d),
               awq.b.optionalFieldOf("sound", awr.kH).forGetter(dcf::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(dcf::f),
               ddo.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(dcf::g)
            )
            .apply($$0, dcf::new)
   );
   public static final za<wn, dcf> c = za.a(yy.l, dcf::c, dac.m, dcf::d, awq.d, dcf::e, yy.b, dcf::f, ddo.e.a(yy.a()), dcf::g, dcf::new);

   public but a(bxw $$0, daa $$1, bus $$2) {
      if (!this.a($$0, $$1)) {
         return but.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return but.c;
         } else {
            daa $$4 = this.a($$0.dV(), $$0, $$1);
            return but.c.a($$4);
         }
      }
   }

   public daa a(djz $$0, bxw $$1, daa $$2) {
      azz $$3 = $$1.dY();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof arv $$4) {
         $$4.b(axb.c.b($$2.h()));
         aq.A.a($$4, $$2);
      }

      $$2.a(dcg.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == dac.c ? egg.l : egg.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bxw $$0, daa $$1) {
      cvp $$2 = $$1.a(kl.v);
      return $$2 != null && $$0 instanceof crz $$3 ? $$3.t($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(azz $$0, bxw $$1, daa $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = azq.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == dac.c ? 0.5F : $$4;
      float $$9 = this.e == dac.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      awq $$11 = $$1 instanceof dcf.b $$10 ? $$10.j($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static dcf.a b() {
      return new dcf.a();
   }

   public float c() {
      return this.d;
   }

   public dac d() {
      return this.e;
   }

   public jg<awq> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<ddo> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private dac b;
      private jg<awq> c;
      private boolean d;
      private final List<ddo> e;

      a() {
         this.b = dac.b;
         this.c = awr.kH;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public dcf.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public dcf.a a(dac $$0) {
         this.b = $$0;
         return this;
      }

      public dcf.a a(jg<awq> $$0) {
         this.c = $$0;
         return this;
      }

      public dcf.a b(jg<awq> $$0) {
         return this.a(new ddp($$0));
      }

      public dcf.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public dcf.a a(ddo $$0) {
         this.e.add($$0);
         return this;
      }

      public dcf a() {
         return new dcf(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      awq j(daa var1);
   }
}
