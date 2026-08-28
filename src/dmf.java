import javax.annotation.Nullable;

public interface dmf {
   @Nullable
   dtz a(ji var1, dwx var2);

   @Nullable
   default <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return null;
   }

   @Nullable
   default <T extends dtz> ebv a(arc $$0, T $$1) {
      return $$1 instanceof ebv.b<?> $$2 ? $$2.c() : null;
   }
}
