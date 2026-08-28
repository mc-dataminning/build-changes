import java.util.List;
import javax.annotation.Nullable;

public record adz(int b, List<cqy.a> c) implements zp<ace> {
   public static final zg<wf, adz> a = zg.a(ze.h, adz::b, cqy.a.a.a(ze.a()), adz::e, adz::new);

   @Override
   public zr<adz> a() {
      return agt.T;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   @Nullable
   public bue a(dfb $$0) {
      return $$0.a(this.b);
   }

   public List<cqy.a> e() {
      return this.c;
   }
}
