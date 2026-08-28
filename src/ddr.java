import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddr(buq c, jq<awn> d, Optional<all> e, Optional<ju<bup<?>>> f, boolean g, boolean h, boolean i) {
   public static final Codec<ddr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               buq.k.fieldOf("slot").forGetter(ddr::a),
               awn.b.optionalFieldOf("equip_sound", awo.as).forGetter(ddr::b),
               all.a.optionalFieldOf("model").forGetter(ddr::c),
               kf.a(ma.z).optionalFieldOf("allowed_entities").forGetter(ddr::d),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(ddr::e),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(ddr::f),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(ddr::g)
            )
            .apply($$0, ddr::new)
   );
   public static final zj<ww, ddr> b = zj.a(
      buq.l, ddr::a, awn.d, ddr::b, all.b.a(zh::a), ddr::c, zh.c(ma.z).a(zh::a), ddr::d, zh.b, ddr::e, zh.b, ddr::f, zh.b, ddr::g, ddr::new
   );

   public static ddr a(cvc $$0) {
      return a(buq.g).a(awo.of).a(ddq.j.get($$0)).a(bup.an, bup.be).a();
   }

   public static ddr.a a(buq $$0) {
      return new ddr.a($$0);
   }

   public bsh a(cwf $$0, cor $$1) {
      if (!$$1.e(this.c)) {
         return bsh.e;
      } else {
         cwf $$2 = $$1.a(this.c);
         if ((!dby.a($$2, dbx.E) || $$1.f()) && !cwf.c($$0, $$2)) {
            if (!$$1.dY().y_()) {
               $$1.b(awy.c.b($$0.h()));
            }

            if ($$0.L() <= 1) {
               cwf $$3 = $$2.f() ? $$0 : $$2.g();
               cwf $$4 = $$1.f() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bsh.a.a($$3);
            } else {
               cwf $$5 = $$2.g();
               cwf $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gl().f($$5)) {
                  $$1.a($$5, false);
               }

               return bsh.a.a($$0);
            }
         } else {
            return bsh.d;
         }
      }
   }

   public boolean a(bup<?> $$0) {
      return this.f.isEmpty() || this.f.get().a($$0.r());
   }

   public buq a() {
      return this.c;
   }

   public jq<awn> b() {
      return this.d;
   }

   public Optional<all> c() {
      return this.e;
   }

   public Optional<ju<bup<?>>> d() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }

   public boolean f() {
      return this.h;
   }

   public boolean g() {
      return this.i;
   }

   public static class a {
      private final buq a;
      private jq<awn> b = awo.as;
      private Optional<all> c = Optional.empty();
      private Optional<ju<bup<?>>> d = Optional.empty();
      private boolean e = true;
      private boolean f = true;
      private boolean g = true;

      a(buq $$0) {
         this.a = $$0;
      }

      public ddr.a a(jq<awn> $$0) {
         this.b = $$0;
         return this;
      }

      public ddr.a a(all $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public ddr.a a(bup<?>... $$0) {
         return this.a(ju.a(bup::r, $$0));
      }

      public ddr.a a(ju<bup<?>> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ddr.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      public ddr.a b(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public ddr.a c(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public ddr a() {
         return new ddr(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
