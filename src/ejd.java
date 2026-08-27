import com.mojang.serialization.Codec;
import java.util.List;

public class ejd extends ejf {
   public static final Codec<ejd> a = a(ejd::new);

   ejd(List<ejo> $$0) {
      super($$0, ejq.b($$0));
   }

   @Override
   public ejp b() {
      return ejq.c;
   }

   public static ejd.a a(ejo.a... $$0) {
      return new ejd.a($$0);
   }

   public static class a extends ejf.a {
      public a(ejo.a... $$0) {
         super($$0);
      }

      @Override
      public ejd.a or(ejo.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ejo a(List<ejo> $$0) {
         return new ejd($$0);
      }
   }
}
