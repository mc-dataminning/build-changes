import com.mojang.serialization.Codec;
import java.util.List;

public class elp extends els {
   public static final Codec<elp> a = a(elp::new);
   public static final Codec<elp> b = b(elp::new);

   elp(List<emb> $$0) {
      super($$0, emd.a($$0));
   }

   public static elp a(List<emb> $$0) {
      return new elp(List.copyOf($$0));
   }

   @Override
   public emc b() {
      return emd.d;
   }

   public static elp.a a(emb.a... $$0) {
      return new elp.a($$0);
   }

   public static class a extends els.a {
      public a(emb.a... $$0) {
         super($$0);
      }

      @Override
      public elp.a and(emb.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected emb a(List<emb> $$0) {
         return new elp($$0);
      }
   }
}
