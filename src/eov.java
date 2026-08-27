import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eov extends eoo {
   public static final Codec<eov> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(dlw.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, eov::new)
   );
   private final dlw b;
   private final boolean c;

   eov(List<eqc> $$0, dlw $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected crj a(crj $$0, enb $$1) {
      if (this.c) {
         $$0.a(jp.N, dlw.a, this.b, ($$0x, $$1x) -> new dlw.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(jp.N, this.b);
      }

      return $$0;
   }

   @Override
   public eoq b() {
      return eor.z;
   }

   public static eov.a a(boolean $$0) {
      return new eov.a($$0);
   }

   public static class a extends eoo.a<eov.a> {
      private final dlw.a a = new dlw.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eov.a a() {
         return this;
      }

      @Override
      public eop b() {
         return new eov(this.g(), this.a.a(), this.b);
      }

      public eov.a a(ajs<dlv> $$0, cqc $$1) {
         return this.a(kr.am.g($$0), $$1);
      }

      public eov.a a(il<dlv> $$0, cqc $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
