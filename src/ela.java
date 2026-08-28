import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class ela extends eiw {
   public static final MapCodec<ela> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ela.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, ela::new)
   );
   private final ela.a e;

   public ela(eiw.c $$0, ela.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eiw.b> a(eiw.a $$0) {
      $$0.f().j();
      dbm $$1 = $$0.h();
      ja $$2 = new ja($$1.b(), 50, $$1.e());
      ejo $$3 = new ejo();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new eiw.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(ejo $$0, eiw.a $$1) {
      dbm $$2 = $$1.h();
      dze $$3 = $$1.f();
      duh $$4 = $$1.b();
      ekz.d $$5 = new ekz.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == ela.a.b) {
         ja $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dyf.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ayg.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public ejf<?> e() {
      return ejf.h;
   }

   public static enum a implements azc {
      a("normal", dfj.U, dfj.n, dfj.dU),
      b("mesa", dfj.aa, dfj.t, dfj.ki);

      public static final Codec<ela.a> c = azc.a(ela.a::values);
      private static final IntFunction<ela.a> d = aww.a(Enum::ordinal, values(), aww.a.a);
      private final String e;
      private final dsk f;
      private final dsk g;
      private final dsk h;

      private a(final String $$0, final dfh $$1, final dfh $$2, final dfh $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static ela.a a(int $$0) {
         return d.apply($$0);
      }

      public dsk b() {
         return this.f;
      }

      public dsk d() {
         return this.g;
      }

      public dsk e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
