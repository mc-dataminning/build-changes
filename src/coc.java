import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class coc implements cob {
   final cnk a;
   final cnk b;
   final cnk c;
   final ckj d;

   public coc(cnk $$0, cnk $$1, cnk $$2, ckj $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bhu $$0, cqz $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public ckj a(bhu $$0, ip $$1) {
      ckj $$2 = this.d.p();
      rt $$3 = $$0.a(1).v();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public ckj a(ip $$0) {
      return this.d;
   }

   @Override
   public boolean a(ckj $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(ckj $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(ckj $$0) {
      return this.c.a($$0);
   }

   @Override
   public cnq<?> aq_() {
      return cnq.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cnk::c);
   }

   public static class a implements cnq<coc> {
      private static final Codec<coc> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cnk.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cnk.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cnk.b.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cne.a.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, coc::new)
      );

      @Override
      public Codec<coc> a() {
         return x;
      }

      public coc b(tl $$0) {
         cnk $$1 = cnk.b($$0);
         cnk $$2 = cnk.b($$0);
         cnk $$3 = cnk.b($$0);
         ckj $$4 = $$0.r();
         return new coc($$1, $$2, $$3, $$4);
      }

      public void a(tl $$0, coc $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$0.a($$1.d);
      }
   }
}
