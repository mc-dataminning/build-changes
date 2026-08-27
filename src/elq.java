import com.mojang.serialization.Codec;
import java.util.List;

public class elq extends els {
   public static final Codec<elq> a = a(elq::new);

   elq(List<emb> $$0) {
      super($$0, emd.b($$0));
   }

   @Override
   public emc b() {
      return emd.c;
   }

   public static elq.a a(emb.a... $$0) {
      return new elq.a($$0);
   }

   public static class a extends els.a {
      public a(emb.a... $$0) {
         super($$0);
      }

      @Override
      public elq.a or(emb.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected emb a(List<emb> $$0) {
         return new elq($$0);
      }
   }
}
