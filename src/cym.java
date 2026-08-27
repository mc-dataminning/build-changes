import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cym implements cyk {
   final cxr a;
   final cxr b;
   final cxr c;

   public cym(cxr $$0, cxr $$1, cxr $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bpn $$0, dax $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cto a(bpn $$0, iz.a $$1) {
      cto $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ix.c<cvt>> $$3 = cvu.a($$1, $$0.a(2));
         Optional<ix.c<cvv>> $$4 = cvw.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            cvs $$5 = $$2.a(kb.J);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cto.i;
            }

            cto $$6 = $$2.c(1);
            $$6.b(kb.J, new cvs($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cto.i;
   }

   @Override
   public cto a(iz.a $$0) {
      cto $$1 = new cto(ctr.pH);
      Optional<ix.c<cvv>> $$2 = $$0.b(lf.aP).b().findFirst();
      Optional<ix.c<cvt>> $$3 = $$0.b(lf.aO).a(cvu.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(kb.J, new cvs($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(cto $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cto $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cto $$0) {
      return this.c.a($$0);
   }

   @Override
   public cxy<?> ao_() {
      return cxy.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cxr::c);
   }

   public static class a implements cxy<cym> {
      private static final MapCodec<cym> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cxr.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cxr.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cxr.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cym::new)
      );
      public static final yv<wi, cym> x = yv.a(cym.a::a, cym.a::a);

      @Override
      public MapCodec<cym> a() {
         return y;
      }

      @Override
      public yv<wi, cym> b() {
         return x;
      }

      private static cym a(wi $$0) {
         cxr $$1 = cxr.b.decode($$0);
         cxr $$2 = cxr.b.decode($$0);
         cxr $$3 = cxr.b.decode($$0);
         return new cym($$1, $$2, $$3);
      }

      private static void a(wi $$0, cym $$1) {
         cxr.b.encode($$0, $$1.a);
         cxr.b.encode($$0, $$1.b);
         cxr.b.encode($$0, $$1.c);
      }
   }
}
