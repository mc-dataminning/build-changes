import javax.annotation.Nullable;

public interface fua extends fud {
   @Deprecated
   @Override
   default float call(cfz $$0, @Nullable few $$1, @Nullable bfz $$2, int $$3) {
      return apa.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cfz var1, @Nullable few var2, @Nullable bfz var3, int var4);
}
