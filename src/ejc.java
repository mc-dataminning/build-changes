import com.mojang.serialization.Codec;
import java.util.List;

public class ejc extends ejf {
   public static final Codec<ejc> a = a(ejc::new);
   public static final Codec<ejc> b = b(ejc::new);

   ejc(List<ejo> $$0) {
      super($$0, ejq.a($$0));
   }

   public static ejc a(List<ejo> $$0) {
      return new ejc(List.copyOf($$0));
   }

   @Override
   public ejp b() {
      return ejq.d;
   }

   public static ejc.a a(ejo.a... $$0) {
      return new ejc.a($$0);
   }

   public static class a extends ejf.a {
      public a(ejo.a... $$0) {
         super($$0);
      }

      @Override
      public ejc.a and(ejo.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ejo a(List<ejo> $$0) {
         return new ejc($$0);
      }
   }
}
