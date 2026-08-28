public interface evs extends erm {
   float b(erl var1);

   default int a(erl $$0) {
      return Math.round(this.b($$0));
   }

   evr b();
}
