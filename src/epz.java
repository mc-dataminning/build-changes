import com.mojang.serialization.Codec;
import java.util.List;

public class epz extends eqc {
   public static final Codec<epz> a = a(epz::new);
   public static final Codec<epz> b = b(epz::new);

   epz(List<eql> $$0) {
      super($$0, ac.a($$0));
   }

   public static epz a(List<eql> $$0) {
      return new epz(List.copyOf($$0));
   }

   @Override
   public eqm b() {
      return eqn.d;
   }

   public static epz.a a(eql.a... $$0) {
      return new epz.a($$0);
   }

   public static class a extends eqc.a {
      public a(eql.a... $$0) {
         super($$0);
      }

      @Override
      public epz.a and(eql.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eql a(List<eql> $$0) {
         return new epz($$0);
      }
   }
}
