import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class czn implements czm {
   final cyt a;
   final cyt b;
   final cyt c;
   final cuq d;

   public czn(cyt $$0, cyt $$1, cyt $$2, cuq $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bqo $$0, dbz $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cuq a(bqo $$0, jk.a $$1) {
      cuq $$2 = $$0.a(1).a(this.d.g(), this.d.I());
      $$2.b(this.d.d());
      return $$2;
   }

   @Override
   public cuq a(jk.a $$0) {
      return this.d;
   }

   @Override
   public boolean a(cuq $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cuq $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cuq $$0) {
      return this.c.a($$0);
   }

   @Override
   public cza<?> ao_() {
      return cza.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyt::c);
   }

   public static class a implements cza<czn> {
      private static final MapCodec<czn> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyt.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyt.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyt.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cuq.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, czn::new)
      );
      public static final zn<xa, czn> x = zn.a(czn.a::a, czn.a::a);

      @Override
      public MapCodec<czn> a() {
         return y;
      }

      @Override
      public zn<xa, czn> b() {
         return x;
      }

      private static czn a(xa $$0) {
         cyt $$1 = cyt.b.decode($$0);
         cyt $$2 = cyt.b.decode($$0);
         cyt $$3 = cyt.b.decode($$0);
         cuq $$4 = cuq.i.decode($$0);
         return new czn($$1, $$2, $$3, $$4);
      }

      private static void a(xa $$0, czn $$1) {
         cyt.b.encode($$0, $$1.a);
         cyt.b.encode($$0, $$1.b);
         cyt.b.encode($$0, $$1.c);
         cuq.i.encode($$0, $$1.d);
      }
   }
}
