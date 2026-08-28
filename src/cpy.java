import java.util.List;

public interface cpy extends bpz, cri {
   int f();

   int g();

   List<cuc> h();

   default cxy aA_() {
      return this.aB_().a();
   }

   default cxy.a aB_() {
      return cxy.b(this.f(), this.g(), this.h());
   }
}
