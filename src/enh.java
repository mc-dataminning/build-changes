import com.mojang.serialization.Codec;
import java.util.List;

public class enh extends enk {
   public static final Codec<enh> a = a(enh::new);
   public static final Codec<enh> b = b(enh::new);

   enh(List<ent> $$0) {
      super($$0, ac.a($$0));
   }

   public static enh a(List<ent> $$0) {
      return new enh(List.copyOf($$0));
   }

   @Override
   public enu b() {
      return env.d;
   }

   public static enh.a a(ent.a... $$0) {
      return new enh.a($$0);
   }

   public static class a extends enk.a {
      public a(ent.a... $$0) {
         super($$0);
      }

      @Override
      public enh.a and(ent.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ent a(List<ent> $$0) {
         return new enh($$0);
      }
   }
}
