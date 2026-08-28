import java.util.List;
import javax.annotation.Nullable;

public record aec(int b, List<crc.a> c) implements zs<ach> {
   public static final zj<wi, aec> a = zj.a(zh.h, aec::b, crc.a.a.a(zh.a()), aec::e, aec::new);

   @Override
   public zu<aec> a() {
      return agw.T;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   @Nullable
   public bui a(dff $$0) {
      return $$0.a(this.b);
   }

   public List<crc.a> e() {
      return this.c;
   }
}
