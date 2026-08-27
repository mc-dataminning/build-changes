import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class dwu extends dux {
   public static final Codec<dwu> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dwu.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, dwu::new)
   );
   private final dwu.a e;

   public dwu(dux.c $$0, dwu.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dux.b> a(dux.a $$0) {
      $$0.f().j();
      cor $$1 = $$0.h();
      gv $$2 = new gv($$1.b(), 50, $$1.e());
      dvp $$3 = new dvp();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new dux.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(dvp $$0, dux.a $$1) {
      cor $$2 = $$1.h();
      dlg $$3 = $$1.f();
      dgv $$4 = $$1.b();
      dwt.d $$5 = new dwt.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == dwu.a.b) {
         gv $$7 = $$0.d().f();
         int $$8 = $$4.a($$7.u(), $$7.w(), dkh.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : aro.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public dvg<?> e() {
      return dvg.h;
   }

   public static enum a implements asf {
      a("normal", csl.U, csl.n, csl.dU),
      b("mesa", csl.aa, csl.t, csl.ki);

      public static final Codec<dwu.a> c = asf.a(dwu.a::values);
      private static final IntFunction<dwu.a> d = aqi.a(Enum::ordinal, values(), aqi.a.a);
      private final String e;
      private final dey f;
      private final dey g;
      private final dey h;

      private a(String $$0, csk $$1, csk $$2, csk $$3) {
         this.e = $$0;
         this.f = $$1.n();
         this.g = $$2.n();
         this.h = $$3.n();
      }

      public String a() {
         return this.e;
      }

      public static dwu.a a(int $$0) {
         return d.apply($$0);
      }

      public dey b() {
         return this.f;
      }

      public dey d() {
         return this.g;
      }

      public dey e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
