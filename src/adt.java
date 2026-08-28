import java.util.List;
import javax.annotation.Nullable;

public record adt(int b, List<cvb.a> c) implements zj<aby> {
   public static final za<vy, adt> a = za.a(yy.h, adt::b, cvb.a.a.a(yy.a()), adt::e, adt::new);

   @Override
   public zl<adt> a() {
      return agr.T;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   @Nullable
   public bwv a(djz $$0) {
      return $$0.a(this.b);
   }

   public List<cvb.a> e() {
      return this.c;
   }
}
