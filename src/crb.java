import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class crb implements cra {
   final cqh a;
   final cqh b;
   final cqh c;
   final cng d;

   public crb(cqh $$0, cqh $$1, cqh $$2, cng $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bjv $$0, ctx $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cng a(bjv $$0, iu $$1) {
      cng $$2 = this.d.p();
      so $$3 = $$0.a(1).v();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public cng a(iu $$0) {
      return this.d;
   }

   @Override
   public boolean a(cng $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cng $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cng $$0) {
      return this.c.a($$0);
   }

   @Override
   public cqo<?> at_() {
      return cqo.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cqh::c);
   }

   public static class a implements cqo<crb> {
      private static final Codec<crb> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cqh.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cqh.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cqh.b.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cng.c.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, crb::new)
      );

      @Override
      public Codec<crb> a() {
         return x;
      }

      public crb b(uj $$0) {
         cqh $$1 = cqh.b($$0);
         cqh $$2 = cqh.b($$0);
         cqh $$3 = cqh.b($$0);
         cng $$4 = $$0.r();
         return new crb($$1, $$2, $$3, $$4);
      }

      public void a(uj $$0, crb $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$0.a($$1.d);
      }
   }
}
