import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cyo implements cym {
   final cxt a;
   final cxt b;
   final cxt c;

   public cyo(cxt $$0, cxt $$1, cxt $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bpp $$0, daz $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public ctq a(bpp $$0, iz.a $$1) {
      ctq $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ix.c<cvv>> $$3 = cvw.a($$1, $$0.a(2));
         Optional<ix.c<cvx>> $$4 = cvy.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            cvu $$5 = $$2.a(kb.J);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return ctq.i;
            }

            ctq $$6 = $$2.c(1);
            $$6.b(kb.J, new cvu($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return ctq.i;
   }

   @Override
   public ctq a(iz.a $$0) {
      ctq $$1 = new ctq(ctt.pH);
      Optional<ix.c<cvx>> $$2 = $$0.b(lf.aP).b().findFirst();
      Optional<ix.c<cvv>> $$3 = $$0.b(lf.aO).a(cvw.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(kb.J, new cvu($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(ctq $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(ctq $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(ctq $$0) {
      return this.c.a($$0);
   }

   @Override
   public cya<?> ap_() {
      return cya.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cxt::c);
   }

   public static class a implements cya<cyo> {
      private static final MapCodec<cyo> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cxt.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cxt.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cxt.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cyo::new)
      );
      public static final yv<wi, cyo> x = yv.a(cyo.a::a, cyo.a::a);

      @Override
      public MapCodec<cyo> a() {
         return y;
      }

      @Override
      public yv<wi, cyo> b() {
         return x;
      }

      private static cyo a(wi $$0) {
         cxt $$1 = cxt.b.decode($$0);
         cxt $$2 = cxt.b.decode($$0);
         cxt $$3 = cxt.b.decode($$0);
         return new cyo($$1, $$2, $$3);
      }

      private static void a(wi $$0, cyo $$1) {
         cxt.b.encode($$0, $$1.a);
         cxt.b.encode($$0, $$1.b);
         cxt.b.encode($$0, $$1.c);
      }
   }
}
