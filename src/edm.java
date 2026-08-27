import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edm extends eds {
   public static final Codec<edm> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egb.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, edm::new)
   );
   private final ega b;
   private final boolean c;

   edm(List<eff> $$0, ega $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public edu b() {
      return edv.d;
   }

   @Override
   public Set<eeo<?>> a() {
      return this.b.a();
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      aru $$2 = $$1.b();
      return cng.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static edm.a a(ega $$0) {
      return new edm.a($$0);
   }

   public static class a extends eds.a<edm.a> {
      private final ega a;
      private boolean b;

      public a(ega $$0) {
         this.a = $$0;
      }

      protected edm.a a() {
         return this;
      }

      public edm.a e() {
         this.b = true;
         return this;
      }

      @Override
      public edt b() {
         return new edm(this.g(), this.a, this.b);
      }
   }
}
