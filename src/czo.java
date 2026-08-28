import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class czo implements czn {
   final cyu a;
   final cyu b;
   final cyu c;
   final cur d;

   public czo(cyu $$0, cyu $$1, cyu $$2, cur $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bqp $$0, dca $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cur a(bqp $$0, jk.a $$1) {
      cur $$2 = $$0.a(1).a(this.d.g(), this.d.I());
      $$2.b(this.d.d());
      return $$2;
   }

   @Override
   public cur a(jk.a $$0) {
      return this.d;
   }

   @Override
   public boolean a(cur $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cur $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cur $$0) {
      return this.c.a($$0);
   }

   @Override
   public czb<?> ao_() {
      return czb.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyu::c);
   }

   public static class a implements czb<czo> {
      private static final MapCodec<czo> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyu.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyu.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyu.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cur.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, czo::new)
      );
      public static final zn<xa, czo> x = zn.a(czo.a::a, czo.a::a);

      @Override
      public MapCodec<czo> a() {
         return y;
      }

      @Override
      public zn<xa, czo> b() {
         return x;
      }

      private static czo a(xa $$0) {
         cyu $$1 = cyu.b.decode($$0);
         cyu $$2 = cyu.b.decode($$0);
         cyu $$3 = cyu.b.decode($$0);
         cur $$4 = cur.i.decode($$0);
         return new czo($$1, $$2, $$3, $$4);
      }

      private static void a(xa $$0, czo $$1) {
         cyu.b.encode($$0, $$1.a);
         cyu.b.encode($$0, $$1.b);
         cyu.b.encode($$0, $$1.c);
         cur.i.encode($$0, $$1.d);
      }
   }
}
