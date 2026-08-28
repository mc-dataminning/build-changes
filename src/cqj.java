import java.util.List;

public interface cqj extends bqj, crt {
   int f();

   int g();

   List<cuo> h();

   default cyn aA_() {
      return this.aB_().a();
   }

   default cyn.a aB_() {
      return cyn.b(this.f(), this.g(), this.h());
   }
}
