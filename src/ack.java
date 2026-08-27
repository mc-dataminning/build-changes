public interface ack extends ue {
   @Override
   default boolean d() {
      return false;
   }
}
