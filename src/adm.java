import java.util.List;
import javax.annotation.Nullable;

public record adm(int b, List<csw.a> c) implements zc<abr> {
   public static final yt<vr, adm> a = yt.a(yr.h, adm::b, csw.a.a.a(yr.a()), adm::e, adm::new);

   @Override
   public ze<adm> a() {
      return agk.T;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   @Nullable
   public bvs a(dhp $$0) {
      return $$0.a(this.b);
   }

   public List<csw.a> e() {
      return this.c;
   }
}
