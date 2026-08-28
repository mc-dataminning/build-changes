import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class enw extends elr {
   public static final MapCodec<enw> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), enw.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, enw::new)
   );
   private final enw.a e;

   public enw(elr.c $$0, enw.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<elr.b> a(elr.a $$0) {
      $$0.f().j();
      deb $$1 = $$0.h();
      jg $$2 = new jg($$1.b(), 50, $$1.e());
      emj $$3 = new emj();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new elr.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(emj $$0, elr.a $$1) {
      deb $$2 = $$1.h();
      eby $$3 = $$1.f();
      dxa $$4 = $$1.b();
      env.d $$5 = new env.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == enw.a.b) {
         jg $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), eaz.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : azj.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public ema<?> e() {
      return ema.h;
   }

   public static enum a implements baf {
      a("normal", dia.U, dia.n, dia.dU),
      b("mesa", dia.aa, dia.t, dia.ki);

      public static final Codec<enw.a> c = baf.a(enw.a::values);
      private static final IntFunction<enw.a> d = aya.a(Enum::ordinal, values(), aya.a.a);
      private final String e;
      private final dvd f;
      private final dvd g;
      private final dvd h;

      private a(final String $$0, final dhy $$1, final dhy $$2, final dhy $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static enw.a a(int $$0) {
         return d.apply($$0);
      }

      public dvd b() {
         return this.f;
      }

      public dvd d() {
         return this.g;
      }

      public dvd e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
