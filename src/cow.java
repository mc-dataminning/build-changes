import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cow implements cov {
   final coc a;
   final coc b;
   final coc c;
   final clb d;

   public cow(coc $$0, coc $$1, coc $$2, clb $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bij $$0, crs $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public clb a(bij $$0, ip $$1) {
      clb $$2 = this.d.p();
      rz $$3 = $$0.a(1).v();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public clb a(ip $$0) {
      return this.d;
   }

   @Override
   public boolean a(clb $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(clb $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(clb $$0) {
      return this.c.a($$0);
   }

   @Override
   public coj<?> aq_() {
      return coj.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(coc::c);
   }

   public static class a implements coj<cow> {
      private static final Codec<cow> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  coc.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  coc.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  coc.b.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cnw.a.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cow::new)
      );

      @Override
      public Codec<cow> a() {
         return x;
      }

      public cow b(tu $$0) {
         coc $$1 = coc.b($$0);
         coc $$2 = coc.b($$0);
         coc $$3 = coc.b($$0);
         clb $$4 = $$0.r();
         return new cow($$1, $$2, $$3, $$4);
      }

      public void a(tu $$0, cow $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$0.a($$1.d);
      }
   }
}
