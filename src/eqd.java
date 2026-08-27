import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqd extends epw {
   public static final Codec<eqd> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(dnd.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, eqd::new)
   );
   private final dnd b;
   private final boolean c;

   eqd(List<erq> $$0, dnd $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected csz a(csz $$0, eol $$1) {
      if (this.c) {
         $$0.a(ka.U, dnd.a, this.b, ($$0x, $$1x) -> new dnd.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(ka.U, this.b);
      }

      return $$0;
   }

   @Override
   public epy b() {
      return epz.B;
   }

   public static eqd.a a(boolean $$0) {
      return new eqd.a($$0);
   }

   public static class a extends epw.a<eqd.a> {
      private final dnd.a a = new dnd.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eqd.a a() {
         return this;
      }

      @Override
      public epx b() {
         return new eqd(this.g(), this.a.a(), this.b);
      }

      public eqd.a a(iw<dnc> $$0, crs $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
