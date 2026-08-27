import com.mojang.serialization.Codec;
import java.util.List;

public class epq extends ept {
   public static final Codec<epq> a = a(epq::new);
   public static final Codec<epq> b = b(epq::new);

   epq(List<eqc> $$0) {
      super($$0, ac.a($$0));
   }

   public static epq a(List<eqc> $$0) {
      return new epq(List.copyOf($$0));
   }

   @Override
   public eqd b() {
      return eqe.d;
   }

   public static epq.a a(eqc.a... $$0) {
      return new epq.a($$0);
   }

   public static class a extends ept.a {
      public a(eqc.a... $$0) {
         super($$0);
      }

      @Override
      public epq.a and(eqc.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eqc a(List<eqc> $$0) {
         return new epq($$0);
      }
   }
}
