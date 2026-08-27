import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eki extends eko {
   public static final Codec<eki> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(emx.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eki::new)
   );
   private final emw b;
   private final boolean c;

   eki(List<emb> $$0, emw $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ekq b() {
      return ekr.d;
   }

   @Override
   public Set<elk<?>> a() {
      return this.b.a();
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      awp $$2 = $$1.b();
      return ctn.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static eki.a a(emw $$0) {
      return new eki.a($$0);
   }

   public static class a extends eko.a<eki.a> {
      private final emw a;
      private boolean b;

      public a(emw $$0) {
         this.a = $$0;
      }

      protected eki.a a() {
         return this;
      }

      public eki.a e() {
         this.b = true;
         return this;
      }

      @Override
      public ekp b() {
         return new eki(this.g(), this.a, this.b);
      }
   }
}
