import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class emc extends emi {
   public static final Codec<emc> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eor.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, emc::new)
   );
   private final eoq b;
   private final boolean c;

   emc(List<env> $$0, eoq $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public emk b() {
      return eml.d;
   }

   @Override
   public Set<ene<?>> a() {
      return this.b.a();
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      axd $$2 = $$1.b();
      return cux.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static emc.a a(eoq $$0) {
      return new emc.a($$0);
   }

   public static class a extends emi.a<emc.a> {
      private final eoq a;
      private boolean b;

      public a(eoq $$0) {
         this.a = $$0;
      }

      protected emc.a a() {
         return this;
      }

      public emc.a e() {
         this.b = true;
         return this;
      }

      @Override
      public emj b() {
         return new emc(this.g(), this.a, this.b);
      }
   }
}
