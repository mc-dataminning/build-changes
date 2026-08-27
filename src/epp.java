import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class epp extends epw {
   public static final Codec<epp> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(esm.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, epp::new)
   );
   private final esl b;
   private final boolean c;

   epp(List<erq> $$0, esl $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public epy b() {
      return epz.f;
   }

   @Override
   public Set<eqz<?>> a() {
      return this.b.a();
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      ayg $$2 = $$1.b();
      return cyh.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static epp.a a(esl $$0) {
      return new epp.a($$0);
   }

   public static class a extends epw.a<epp.a> {
      private final esl a;
      private boolean b;

      public a(esl $$0) {
         this.a = $$0;
      }

      protected epp.a a() {
         return this;
      }

      public epp.a e() {
         this.b = true;
         return this;
      }

      @Override
      public epx b() {
         return new epp(this.g(), this.a, this.b);
      }
   }
}
