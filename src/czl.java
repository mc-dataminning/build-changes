import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class czl implements czk {
   final cyr a;
   final cyr b;
   final cyr c;
   final cuo d;

   public czl(cyr $$0, cyr $$1, cyr $$2, cuo $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bqm $$0, dbx $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cuo a(bqm $$0, jk.a $$1) {
      cuo $$2 = $$0.a(1).a(this.d.g(), this.d.I());
      $$2.b(this.d.d());
      return $$2;
   }

   @Override
   public cuo a(jk.a $$0) {
      return this.d;
   }

   @Override
   public boolean a(cuo $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cuo $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cuo $$0) {
      return this.c.a($$0);
   }

   @Override
   public cyy<?> ao_() {
      return cyy.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyr::c);
   }

   public static class a implements cyy<czl> {
      private static final MapCodec<czl> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyr.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyr.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyr.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cuo.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, czl::new)
      );
      public static final zm<wz, czl> x = zm.a(czl.a::a, czl.a::a);

      @Override
      public MapCodec<czl> a() {
         return y;
      }

      @Override
      public zm<wz, czl> b() {
         return x;
      }

      private static czl a(wz $$0) {
         cyr $$1 = cyr.b.decode($$0);
         cyr $$2 = cyr.b.decode($$0);
         cyr $$3 = cyr.b.decode($$0);
         cuo $$4 = cuo.i.decode($$0);
         return new czl($$1, $$2, $$3, $$4);
      }

      private static void a(wz $$0, czl $$1) {
         cyr.b.encode($$0, $$1.a);
         cyr.b.encode($$0, $$1.b);
         cyr.b.encode($$0, $$1.c);
         cuo.i.encode($$0, $$1.d);
      }
   }
}
