import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class ekj extends eif {
   public static final MapCodec<ekj> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ekj.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, ekj::new)
   );
   private final ekj.a e;

   public ekj(eif.c $$0, ekj.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eif.b> a(eif.a $$0) {
      $$0.f().j();
      dba $$1 = $$0.h();
      iz $$2 = new iz($$1.b(), 50, $$1.e());
      eix $$3 = new eix();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new eif.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(eix $$0, eif.a $$1) {
      dba $$2 = $$1.h();
      dyo $$3 = $$1.f();
      dtu $$4 = $$1.b();
      eki.d $$5 = new eki.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == ekj.a.b) {
         iz $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dxp.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ayu.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public eio<?> e() {
      return eio.h;
   }

   public static enum a implements azp {
      a("normal", dew.U, dew.n, dew.dU),
      b("mesa", dew.aa, dew.t, dew.ki);

      public static final Codec<ekj.a> c = azp.a(ekj.a::values);
      private static final IntFunction<ekj.a> d = axl.a(Enum::ordinal, values(), axl.a.a);
      private final String e;
      private final drx f;
      private final drx g;
      private final drx h;

      private a(final String $$0, final deu $$1, final deu $$2, final deu $$3) {
         this.e = $$0;
         this.f = $$1.n();
         this.g = $$2.n();
         this.h = $$3.n();
      }

      public String a() {
         return this.e;
      }

      public static ekj.a a(int $$0) {
         return d.apply($$0);
      }

      public drx b() {
         return this.f;
      }

      public drx d() {
         return this.g;
      }

      public drx e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
