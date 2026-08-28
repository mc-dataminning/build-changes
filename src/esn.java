import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class esn extends eqi {
   public static final MapCodec<esn> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), esn.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, esn::new)
   );
   private final esn.a e;

   public esn(eqi.c $$0, esn.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eqi.b> a(eqi.a $$0) {
      $$0.f().j();
      dhw $$1 = $$0.h();
      iu $$2 = new iu($$1.b(), 50, $$1.e());
      era $$3 = new era();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new eqi.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(era $$0, eqi.a $$1) {
      dhw $$2 = $$1.h();
      egm $$3 = $$1.f();
      ebm $$4 = $$1.b();
      esm.d $$5 = new esm.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == esn.a.b) {
         iu $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), efn.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : azk.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public eqr<?> e() {
      return eqr.h;
   }

   public static enum a implements bai {
      a("normal", dlw.X, dlw.n, dlw.eh),
      b("mesa", dlw.ad, dlw.t, dlw.kI);

      public static final Codec<esn.a> c = bai.a(esn.a::values);
      private static final IntFunction<esn.a> d = aya.a(Enum::ordinal, values(), aya.a.a);
      private final String e;
      private final dzo f;
      private final dzo g;
      private final dzo h;

      private a(final String $$0, final dlu $$1, final dlu $$2, final dlu $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static esn.a a(int $$0) {
         return d.apply($$0);
      }

      public dzo b() {
         return this.f;
      }

      public dzo d() {
         return this.g;
      }

      public dzo e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
