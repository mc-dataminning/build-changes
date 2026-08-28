import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class eup extends euy {
   public static final MapCodec<eup> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ext.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kd.a(lw.aN).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, eup::new)
   );
   private final exs b;
   private final Optional<js<dbn>> c;

   eup(List<eww> $$0, exs $$1, Optional<js<dbn>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eva<eup> b() {
      return evb.g;
   }

   @Override
   public Set<ewe<?>> a() {
      return this.b.a();
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      azn $$2 = $$1.b();
      kc $$3 = $$1.d().G_();
      return dbp.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static eup.a a(jq.a $$0, exs $$1) {
      return new eup.a($$1).a($$0.d(lw.aN).b(awy.n));
   }

   public static class a extends euy.a<eup.a> {
      private final exs a;
      private Optional<js<dbn>> b = Optional.empty();

      public a(exs $$0) {
         this.a = $$0;
      }

      protected eup.a a() {
         return this;
      }

      public eup.a a(js<dbn> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public euz b() {
         return new eup(this.g(), this.a, this.b);
      }
   }
}
