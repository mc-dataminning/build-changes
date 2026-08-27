import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class czr implements czq {
   final cyv a;
   final cyv b;
   final cyv c;
   final cuh d;

   public czr(cyv $$0, cyv $$1, cyv $$2, cuh $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bpt $$0, dca $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cuh a(bpt $$0, jc.a $$1) {
      cuh $$2 = $$0.a(1).a(this.d.f(), this.d.G());
      $$2.a(this.d.c());
      return $$2;
   }

   @Override
   public cuh a(jc.a $$0) {
      return this.d;
   }

   @Override
   public boolean a(cuh $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cuh $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cuh $$0) {
      return this.c.a($$0);
   }

   @Override
   public cze<?> ao_() {
      return cze.w;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyv::c);
   }

   public static class a implements cze<czr> {
      private static final Codec<czr> A = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cyv.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyv.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyv.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cuh.a.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, czr::new)
      );
      public static final zc<wp, czr> a = zc.a(czr.a::a, czr.a::a);

      @Override
      public Codec<czr> a() {
         return A;
      }

      @Override
      public zc<wp, czr> b() {
         return a;
      }

      private static czr a(wp $$0) {
         cyv $$1 = cyv.b.decode($$0);
         cyv $$2 = cyv.b.decode($$0);
         cyv $$3 = cyv.b.decode($$0);
         cuh $$4 = cuh.f.decode($$0);
         return new czr($$1, $$2, $$3, $$4);
      }

      private static void a(wp $$0, czr $$1) {
         cyv.b.encode($$0, $$1.a);
         cyv.b.encode($$0, $$1.b);
         cyv.b.encode($$0, $$1.c);
         cuh.f.encode($$0, $$1.d);
      }
   }
}
